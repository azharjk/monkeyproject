import React from 'react';

interface OnMenuClickProps {
  drawerRef: React.RefObject<HTMLElement>;
  drawerSpacerRef: React.RefObject<HTMLElement>;
}

export const DrawerStateCloseClassName = 'drawer--close';
export const DrawerSpacerStateCloseClassName = 'drawer-spacer--close';

const DrawerWithNavbarImpl = {
  onMenuClick: (props: OnMenuClickProps) => {
    if (props.drawerRef.current)
      props.drawerRef.current.classList.toggle(DrawerStateCloseClassName);
    if (props.drawerSpacerRef.current)
      props.drawerSpacerRef.current.classList.toggle(
        DrawerSpacerStateCloseClassName
      );
  },
};

export default DrawerWithNavbarImpl;
