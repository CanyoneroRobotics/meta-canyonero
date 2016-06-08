This layer provides a Poky image for the Canyonero rover on-board Raspberry Pi 3 computer.

## Dependencies ##

  This layer depends on:

  **Yocto**  
  
  URI: git://git.yoctoproject.org/poky
  
  branch: jethro
  
  **OpenEmbedded**
  
  URI: git://git.openembedded.org/meta-openembedded
  
  branch: jethro

  **meta-raspberrypi**  
  
  URI: git://git.yoctoproject.org/meta-raspberrypi
  
  branch: master

  **meta-ros**
  
  URI: https://github.com/bmwcarit/meta-ros.git
  
  branch: master
  
  **meta-maker**
  
  URI: git://git.yoctoproject.org/meta-maker
  
  branch: master
  
## BB layers ##
Modify your ./conf/bblayers.conf as below:
```
BBLAYERS ?= " \
  /your/working/path/poky/meta \
  /your/working/path/poky/meta-yocto \
  /your/working/path/poky/meta-yocto-bsp \
  /your/working/path/poky/meta-raspberrypi \
  /your/working/path/poky/meta-ros \
  /your/working/path/poky/meta-canyonero \
  /your/working/path/poky/meta-maker \
  /your/working/path/poky/oe-core/meta-oe \
  /your/working/path/poky/oe-core/meta-perl \
  /your/working/path/poky/oe-core/meta-python \
  "
BBLAYERS_NON_REMOVABLE ?= " \
  /your/working/path/poky/meta \
  /your/working/path/poky/meta-yocto \
  "
```
  
## Bitbake details ##
```
Build Configuration:
BB_VERSION        = "1.28.0"
BUILD_SYS         = "x86_64-linux"
NATIVELSBSTRING   = "Ubuntu-16.04"
TARGET_SYS        = "arm-poky-linux-gnueabi"
MACHINE           = "raspberrypi3"
DISTRO            = "poky"
DISTRO_VERSION    = "2.0.2"
TUNE_FEATURES     = "arm armv7a vfp thumb neon callconvention-hard vfpv4 cortexa7"
TARGET_FPU        = "vfp-vfpv4-neon"
meta              
meta-yocto        
meta-yocto-bsp    = "jethro:ddbc13155f4db5d98976dc93b586c0be4fc740d1"
meta-raspberrypi  = "master:69840c0bbe03c2e61601e2377c8e2adc264e0478"
meta-ros          = "master:d8a349fb2a7ed5f5d77cb6cebdb6bf534851cce9"
meta-canyonero    = "master:b1860892f5d65891db24d933af9feeb4143eef03"
meta-maker        = "master:c039fafa7a0276769d0928d16bdacd2012f2aff6"
meta-oe           
meta-perl         
meta-python       = "jethro:cb7e68f2a39fa6f24add48fc7b8d38fb7291bb44"
```
