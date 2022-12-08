import React, { useRef } from 'react';
import DrawerWithNavbarImpl, {
  DrawerSpacerStateCloseClassName,
  DrawerStateCloseClassName,
} from './DrawerWithNavbarImpl';
import Navbar from './Navbar';
import DrawerContent from './DrawerContent';

export default function DrawerWithNavbar(props: React.PropsWithChildren) {
  const drawerRef = useRef<HTMLDivElement>(null);
  const drawerSpacerRef = useRef<HTMLDivElement>(null);

  const onMenuClick = () => {
    DrawerWithNavbarImpl.onMenuClick({
      drawerRef,
      drawerSpacerRef,
    });
  };

  return (
    <>
      <Navbar onMenuClick={onMenuClick} />
      <div className="drawer-container">
        <div className={`drawer ${DrawerStateCloseClassName}`} ref={drawerRef}>
          <DrawerContent />
        </div>
        <div className="drawer-content-container">
          <div
            ref={drawerSpacerRef}
            className={`drawer-spacer ${DrawerSpacerStateCloseClassName}`}
          ></div>
          <div>{props.children}</div>
        </div>
      </div>
    </>
  );
}
