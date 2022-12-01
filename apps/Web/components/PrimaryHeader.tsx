import Image from 'next/image';
import { useEffect, useState } from 'react';
import { formatDate, formatTime } from '../utils';

export default function PrimaryHeader() {
  const [date, setDate] = useState('');
  const [time, setTime] = useState('');

  useEffect(() => {
    const interval = setInterval(() => {
      const d = new Date();
      setDate(formatDate(d));
      setTime(formatTime(d));
    }, 1000);

    return () => clearInterval(interval);
  }, []);

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
        <span className="bold">{date}</span>
        {` `}
        <span>{time}</span>
      </div>
    </header>
  );
}
