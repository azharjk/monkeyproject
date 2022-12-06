import '../styles/globals.scss';
import type { AppProps } from 'next/app';
import { Roboto } from '@next/font/google';
import MasterLayout from '../components/MasterLayout';

const roboto = Roboto({ weight: ['400', '500'], subsets: ['latin'] });

export default function App({ Component, pageProps }: AppProps) {
  return (
    <div className={roboto.className}>
      <MasterLayout>
        <Component {...pageProps} />
      </MasterLayout>
    </div>
  );
}
