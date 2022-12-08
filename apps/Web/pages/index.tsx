import Head from 'next/head';
import Navbar from '../components/Navbar';
import Project from '../meta/project';

export default function RootPage() {
  return (
    <>
      <Head>
        <title>{`Home | ${Project.Name}`}</title>
      </Head>
      <Navbar />
      <h1>Hello, world</h1>
    </>
  );
}
