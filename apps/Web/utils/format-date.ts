export const formatDate = (date: Date): string => {
  const months = [
    'Jan',
    'Feb',
    'Mar',
    'Apr',
    'May',
    'Jun',
    'Jul',
    'Aug',
    'Sep',
    'Oct',
    'Nov',
    'Dec',
  ];

  const year = date.getFullYear();
  const month = date.getMonth();
  const day = date.getDate();

  let dayAsString = day.toString();

  if (day < 10) {
    dayAsString = `0${day}`;
  }

  return `${dayAsString}-${months[month]}-${year}`;
};

export const formatTime = (date: Date): string => {
  const hours = date.getHours();
  const minutes = date.getMinutes();
  const seconds = date.getSeconds();

  let hoursAsString = hours.toString();
  let minutesAsString = minutes.toString();
  let secondsAsString = seconds.toString();

  if (hours < 10) {
    hoursAsString = `0${hours}`;
  }
  if (minutes < 10) {
    minutesAsString = `0${minutes}`;
  }
  if (seconds < 10) {
    secondsAsString = `0${seconds}`;
  }

  return `${hoursAsString}:${minutesAsString}:${secondsAsString}`;
};
