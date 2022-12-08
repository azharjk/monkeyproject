import Image from 'next/image';
import PrimaryHeaderImpl from './PrimaryHeaderImpl';

export default function PrimaryHeader() {
  const dateTime = PrimaryHeaderImpl.useDateTime();

  return (
    <header className="primary-header">
      <div>
        <Image
          src="/itenas-logo.png"
          alt="Itenas logo"
          width={170}
          height={56}
        />
      </div>
      <div className="timespan">
        <span className="bold">{dateTime.date}</span>
        {` `}
        <span>{dateTime.time}</span>
      </div>
    </header>
  );
}
