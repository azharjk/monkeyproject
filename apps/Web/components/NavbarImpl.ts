import React from 'react';

interface OnSettingClickProps {
  settingDropdownRef: React.RefObject<HTMLElement>;
}

const NavSettingListDropdownClassName = 'nav-setting-list--dropdown';

const NavbarImpl = {
  onSettingClick: (props: OnSettingClickProps) => {
    if (props.settingDropdownRef.current)
      props.settingDropdownRef.current.classList.toggle(
        NavSettingListDropdownClassName
      );
  },
};

export default NavbarImpl;
