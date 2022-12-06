import Head from 'next/head';
import Image from 'next/image';
import Link from 'next/link';
import Project from '../meta/project';

export default function LoginPage() {
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
            <form className="login-form-container">
              <div className="login-form-field">
                <label className="login-form-field__label" htmlFor="nim">
                  NIM
                </label>
                <input
                  className="login-form-field__input"
                  type="text"
                  id="nim"
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
