export default function AktivitasKuliahTable() {
  return (
    <div className="ak-table-container">
      <table className="ak-table">
        <thead className="ak-thead">
          <tr>
            <th>Kode</th>
            <th>Mata kuliah</th>
            <th>SKS</th>
            <th>Kelas</th>
            <th>UTS</th>
            <th>Hari</th>
            <th>Jam</th>
            <th>Status</th>
          </tr>
        </thead>
        <tbody>
          {Array.apply(null, Array(5)).map((_, i) => (
            <tr key={i}>
              <td>IFB-111</td>
              <td>Matematika</td>
              <td>3</td>
              <td>DD</td>
              <td>28</td>
              <td>Senin</td>
              <td>07:00 - 09:50</td>
              <td>Terima</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
