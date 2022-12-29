import Head from 'next/head';
import Image from 'next/image';
import Link from 'next/link';
import Project from '../meta/project';
import { FormEvent, useState } from 'react';
import { LoginImpl } from '../logic/login-impl';

export default function LoginPage() {
  const [nim, setNim] = useState('');
  const [pinCode, setPinCode] = useState('');

  const onLoginSubmit = async (e: FormEvent) => {
    e.preventDefault();

    const credentials = {
      nim,
      pinCode,
    };

    if (!LoginImpl.validateCredentials(credentials)) {
      alert('Invalid credentials format');
      return;
    }

    const accessRefreshToken = await LoginImpl.login(credentials);

    // TODO: Save the access token and refresh token to localStorae
  };

  return (
    <>
      <Head>
        <title>{`Login | ${Project.Name}`}</title>
      </Head>
      <div className="login-wrapper">
        <div className="login-container">
          <div className="login-banner">
            <Image
              src="/itenas-logo-simple.jpg"
              alt="Itenas logo simple"
              width={140}
              height={140}
            />
          </div>
          <div>
            <h2 className="login-group-title">Portal Mahasiswa</h2>
            <form
              className="login-form-container"
              onSubmit={(e) => onLoginSubmit(e)}
            >
              <div className="login-form-field">
                <label className="login-form-field__label" htmlFor="nim">
                  NIM
                </label>
                <input
                  className="login-form-field__input"
                  type="text"
                  id="nim"
                  value={nim}
                  onChange={(e) => setNim(e.target.value)}
                />
              </div>
              <div className="login-form-field">
                <label className="login-form-field__label" htmlFor="pin-code">
                  Kode PIN
                </label>
                <input
                  className="login-form-field__input"
                  type="text"
                  id="pin-code"
                  value={pinCode}
                  onChange={(e) => setPinCode(e.target.value)}
                />
              </div>
              <div className="login-helper-container">
                <Link className="login-helper-forgot" href="#">
                  Forgot Kode PIN?
                </Link>
              </div>
              <button className="login-form-button">Login</button>
            </form>
          </div>
        </div>
      </div>
    </>
  );
}
