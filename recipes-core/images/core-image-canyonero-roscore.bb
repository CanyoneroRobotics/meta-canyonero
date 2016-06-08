DESCRIPTION = "A small image just capable of starting roscore."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_INSTALL += " \
	dropbear \
	kernel-modules \
	razor-imu-9dof \
	roslaunch \
	rosserial-arduino \
	rosserial-client \
	rosserial-embeddedlinux \
	rosserial-msgs \
	rosserial-python \
	rgbd-launch \
	iw \
	linux-firmware-brcm43430 \
 	wireless-tools \
 	wpa-supplicant \
	wiringpi \
 	rpio \
 	rpi-gpio"

