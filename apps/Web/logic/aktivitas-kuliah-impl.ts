import { createColumnHelper } from '@tanstack/react-table';
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

const columnHelper = createColumnHelper<AktivitasKuliah>();

export const columns = [
  columnHelper.accessor('id', {
    cell: (info) => info.renderValue(),
    header: () => 'ID',
  }),
  columnHelper.accessor('date', {
    cell: (info) => info.renderValue(),
    header: () => 'Date',
  }),
  columnHelper.accessor('time', {
    cell: (info) => info.renderValue(),
    header: () => 'Time',
  }),
  columnHelper.accessor('mataKuliah.name', {
    cell: (info) => info.renderValue(),
    header: () => 'Mata Kuliah',
  }),
];

export const AktivitasKuliahImpl = {
  findAll: async () => {
    const res = await Query.get<AktivitasKuliah[]>(ApiUrl.AktivitasKuliah, {
      authorization: 'Bearer sometoken',
    });

    return res;
  },
};
