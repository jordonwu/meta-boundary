# Basically core-image-sato-dev + extra packages in IMAGE_INSTALL below

DESCRIPTION = "Image with Sato for development work. It includes everything \
within core-image-sato plus a native toolchain, application development and \
testing libraries, profiling and debug symbols. \
Also includes many other packages for a generic Boundary Devices Evaluation Image"

IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-dropbear hwcodecs dev-pkgs"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "\
	packagegroup-core-x11-sato-games \
	firefox \
	chromium \
	chromium-codecs-ffmpeg \
	chromium-codecs-ffmpeg-bin \
	nodejs \
	packagegroup-fsl-gstreamer1.0-full \
	\
	flex \
	gcc \
	git \
	m4 \
	make \
	iperf \
	libtool \
	nano \
	python-compiler \
	strace \
	screen \
	minicom \
"

IMAGE_INSTALL_append_nitrogen6x += "video-input-icon"
