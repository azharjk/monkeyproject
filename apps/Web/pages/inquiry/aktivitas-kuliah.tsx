import Head from 'next/head';
import Project from '../../meta/project';
import DrawerWithNavbar from '../../components/DrawerWithNavbar';
import AktivitasKuliahMetadata from '../../components/AktivitasKuliahMetadata';
import AktivitasKuliahTable from '../../components/AktivitasKuliahTable';

export default function AktivitasKuliahPage() {
  return (
    <>
      <Head>
        <title>{`Aktivitas kuliah | ${Project.Name}`}</title>
      </Head>
      <DrawerWithNavbar>
        <div>
          <h2 className="ak-content-title">Aktivitas kuliah</h2>
          <AktivitasKuliahMetadata />
          <AktivitasKuliahTable />
        </div>
      </DrawerWithNavbar>
    </>
  );
}
