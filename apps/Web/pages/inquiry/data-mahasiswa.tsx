import Head from 'next/head';
import Project from '../../meta/project';
import DrawerWithNavbar from '../../components/DrawerWithNavbar';

export default function DataMahasiswaPage() {
  return (
    <>
      <Head>
        <title>{`Data mahasiswa | ${Project.Name}`}</title>
      </Head>
      <DrawerWithNavbar>
        <div>
          <h2 className="content-title-text">Data mahasiswa</h2>
          <div>
            <div>
              <span className="bold">NIM: </span>
              <span>152022170</span>
            </div>
            <div>
              <span className="bold">Nama: </span>
              <span>John Doe</span>
            </div>
          </div>
        </div>
      </DrawerWithNavbar>
    </>
  );
}
