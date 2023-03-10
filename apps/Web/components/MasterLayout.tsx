import React from 'react';
import PrimaryHeader from './PrimaryHeader';

export default function MasterLayout(props: React.PropsWithChildren) {
  return (
    <>
      <PrimaryHeader />
      <main className="main-container">{props.children}</main>
    </>
  );
}
