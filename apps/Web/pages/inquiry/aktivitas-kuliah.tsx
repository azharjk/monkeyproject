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
        <div>
          <h2 className="ak-content-title">Aktivitas kuliah</h2>
          <div className="ak-metadata">
            <div className="ak-info-start">
              <h4 className="ak-info-semester">Semester ganjil 2022/2023</h4>
            </div>
            <div className="ak-metadata-nested">
              <div className="ak-metadata-field ak-metadata-area">
                <label htmlFor="pilihan" className="ak-metadata-field__label">
                  Pilihan
                </label>
                <select id="pilihan" className="ak-metadata-field__select">
                  <option value="semester-reguler">Semester reguler</option>
                  <option value="semester-pendek">Semester pendek</option>
                </select>
              </div>
              <div className="ak-metadata-nested-area">
                <div className="ak-metadata-nested">
                  <div className="ak-metadata-field">
                    <label
                      htmlFor="tahun-ajaran"
                      className="ak-metadata-field__label"
                    >
                      Tahun ajaran
                    </label>
                    <select
                      className="ak-metadata-field__select"
                      id="tahun-ajaran"
                    >
                      <option value="2022">2022</option>
                    </select>
                  </div>
                  <div className="ak-metadata-field">
                    <label
                      htmlFor="semester"
                      className="ak-metadata-field__label"
                    >
                      Semester
                    </label>
                    <select className="ak-metadata-field__select" id="semester">
                      <option value="1">1</option>
                      <option value="2">2</option>
                    </select>
                  </div>
                </div>
              </div>
            </div>
            <div className="ak-info-end">
              <h4 className="ak-info-semester">Semester ganjil 2022/2023</h4>
            </div>
          </div>
        </div>
      </DrawerWithNavbar>
    </>
  );
}
