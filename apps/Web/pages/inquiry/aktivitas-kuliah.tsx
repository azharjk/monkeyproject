import Head from 'next/head';
import Project from '../../meta/project';
import DrawerWithNavbar from '../../components/DrawerWithNavbar';

export default function AktivitasKuliahPage() {
  return (
    <>
      <Head>
        <title>{`Aktivitas kuliah | ${Project.Name}`}</title>
      </Head>
      <DrawerWithNavbar>
        <h1>aktivitas kuliah</h1>
      </DrawerWithNavbar>
    </>
  );
}
