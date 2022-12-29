import Head from 'next/head';
import Project from '../../meta/project';
import DrawerWithNavbar from '../../components/DrawerWithNavbar';
import AktivitasKuliahMetadata from '../../components/AktivitasKuliahMetadata';
import AktivitasKuliahTable from '../../components/AktivitasKuliahTable';
import { GetServerSideProps } from 'next';
import {
  AktivitasKuliahImpl,
  AktivitasKuliah,
  columns,
} from '../../logic/aktivitas-kuliah-impl';

interface AktivitasKuliahPageProps {
  aktivitasKuliah: AktivitasKuliah[];
}

export const getServerSideProps: GetServerSideProps<
  AktivitasKuliahPageProps
> = async (context) => {
  const aktivitasKuliah = await AktivitasKuliahImpl.findAll();

  return {
    props: {
      aktivitasKuliah,
    },
  };
};

export default function AktivitasKuliahPage(props: AktivitasKuliahPageProps) {
  return (
    <>
      <Head>
        <title>{`Aktivitas kuliah | ${Project.Name}`}</title>
      </Head>
      <DrawerWithNavbar>
        <div>
          <h2 className="content-title-text">Aktivitas kuliah</h2>
          <AktivitasKuliahMetadata />
          <AktivitasKuliahTable
            data={props.aktivitasKuliah}
            columns={columns}
          />
        </div>
      </DrawerWithNavbar>
    </>
  );
}
