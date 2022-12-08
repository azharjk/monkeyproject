import { useState, useEffect } from 'react';
import { formatDate, formatTime } from '../utils';

const PrimaryHeaderImpl = {
  useDateTime: () => {
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

    return {
      date,
      time,
    };
  },
};

export default PrimaryHeaderImpl;
