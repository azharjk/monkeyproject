import { ApiUrl } from '../meta/api-url';
import { Query } from '../utils/query';

interface MataKuliah {
  id: number;
  name: string;
  sks: number;
}

export interface AktivitasKuliah {
  id: number;
  date: string;
  time: string;
  mataKuliah: MataKuliah;
}

export const AktivitasKuliahImpl = {
  findAll: async () => {
    const res = await Query.get<AktivitasKuliah[]>(ApiUrl.AktivitasKuliah, {
      authorization: 'Bearer sometoken',
    });

    return res;
  },
};
