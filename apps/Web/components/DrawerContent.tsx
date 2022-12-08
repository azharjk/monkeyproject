export default function DrawerContent() {
  return (
    <ul className="drawer-content-list">
      <li className="drawer-content-list__item">
        <span className="drawer-content-list__item-title">Inquiry</span>
        <ul className="drawer-content-subcontent-list">
          <li>Data mahasiswa</li>
          <li>Nilai semester</li>
          <li>Keuangan semester</li>
          <li>Aktifitas kuliah</li>
          <li>Kehadiran kuliah</li>
          <li>Hasil perwalian/BDATM</li>
          <li>Hasil KRS dan Tagihan awal</li>
        </ul>
      </li>
      <li className="drawer-content-list__item">Pendaftaran semester</li>
      <li className="drawer-content-list__item">Lain - lain</li>
    </ul>
  );
}
