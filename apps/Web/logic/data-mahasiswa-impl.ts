import { ApiUrl } from '../meta/api-url';
import { Query } from '../utils/query';

export interface Mahasiswa {
  id: number;
  nim: string;
  name: string;
}

export const DataMahasiswaImpl = {
  findDetail: async () => {
    const res = await Query.get<Mahasiswa>(ApiUrl.DataMahasiswa, {
      authorization: 'Bearer sometoken',
    });

    return res;
  },
};
