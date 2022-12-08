import Head from 'next/head';
import DrawerWithNavbar from '../components/DrawerWithNavbar';
import Project from '../meta/project';

export default function RootPage() {
  return (
    <>
      <Head>
        <title>{`Home | ${Project.Name}`}</title>
      </Head>
      <DrawerWithNavbar>
        <h1>Hello</h1>
      </DrawerWithNavbar>
    </>
  );
}
