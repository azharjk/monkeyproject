import Head from 'next/head';
import Project from '../../meta/project';
import DrawerWithNavbar from '../../components/DrawerWithNavbar';
import { GetServerSideProps } from 'next';
import { DataMahasiswaImpl, Mahasiswa } from '../../logic/data-mahasiswa-impl';

interface DataMahasiswaProps {
  mahasiswa: Mahasiswa;
}

export const getServerSideProps: GetServerSideProps<
  DataMahasiswaProps
> = async (context) => {
  const mahasiswa = await DataMahasiswaImpl.findDetail();

  return {
    props: {
      mahasiswa,
    },
  };
};

export default function DataMahasiswaPage(props: DataMahasiswaProps) {
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
              <span>{props.mahasiswa.nim}</span>
            </div>
            <div>
              <span className="bold">Nama: </span>
              <span>{props.mahasiswa.name}</span>
            </div>
          </div>
        </div>
      </DrawerWithNavbar>
    </>
  );
}
