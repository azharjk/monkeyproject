import React from 'react';
import Navbar from './Navbar';
import PrimaryHeader from './PrimaryHeader';

export default function MasterLayout(props: React.PropsWithChildren) {
  return (
    <>
      <PrimaryHeader />
      <main>{props.children}</main>
    </>
  );
}
