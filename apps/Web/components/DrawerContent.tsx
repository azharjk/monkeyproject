import Link from 'next/link';

export default function DrawerContent() {
  return (
    <ul className="drawer-content-list">
      <li className="drawer-content-list__item">
        <span className="bold drawer-content-list__item-title">Inquiry</span>
        <ul className="drawer-content-subcontent-list">
          <li>Data mahasiswa</li>
          <li>Nilai semester</li>
          <li>Keuangan semester</li>
          <li>
            <Link
              className="drawer-content-link"
              href="/inquiry/aktivitas-kuliah"
            >
              Aktivitas kuliah
            </Link>
          </li>
          <li>Kehadiran kuliah</li>
          <li>Hasil perwalian/BDATM</li>
          <li>Hasil KRS dan Tagihan awal</li>
        </ul>
      </li>
      <li className="drawer-content-list__item">
        <span className="bold drawer-content-list__item-title drawer-content-list__item-title--not-first">
          Pendaftaran Semester
        </span>
        <ul className="drawer-content-subcontent-list">
          <li>Jadwal kuliah perwalian</li>
          <li>Perwalian</li>
          <li>Batal tambah (BDATM)</li>
        </ul>
      </li>
      <li className="drawer-content-list__item">
        <span className="bold drawer-content-list__item-title drawer-content-list__item-title--not-first">
          Lain - lain
        </span>
        <ul className="drawer-content-subcontent-list">
          <li>Permohonan angsuran</li>
          <li>Cetak lebih bayar</li>
        </ul>
      </li>
    </ul>
  );
}
