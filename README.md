# JAVA
java project
参考网址：https://blog.csdn.net/jay463261929/article/details/53419561
https://blog.csdn.net/Sparta_117/article/details/77851876
https://blog.csdn.net/z17816876284/article/details/79159518
https://github.com/IntelRealSense/librealsense/blob/master/doc/installation.md
                                         一、安装SDK
需要git和cmake
sudo apt-get install git cmake3

下载librealsense包

先决条件

×需要解锁内核

更新ubuntu
1.更新ubuntu和内核
sudo apt-get update && sudo apt-get upgrade && sudo apt-get dist-upgrade
重启启用新内核：sudo update-grub && sudo reboot
在进系统时：高级选项，选择新的内核
查看内核： uname -r

V4L
1.相机要拔掉
2.安装openssl包
sudo apt-get install libssl-dev
3.安装librealsense源文件内的udev规则
sudo cp config/99-realsense-libusb.rules /etc/udev/rules.d/
sudo udevadm control --reload-rules && udevadm trigger
4.编译并应用补丁后的核心模块
./scripts/patch-realsense-ubuntu-lts.sh（很久）

××××××报错××××××××××××
1. modprobe: FATAL: Module videobuf2_core is in use.
方法：
sudo modprobe -r uvcvideo
sudo modprobe -r videobuf2_core (imho it unwinds automatically once you release uvcvideo)
sudo modprobe -r videodev
××××××××××××××××××××××

检查：
dmesg | tail -n 50
显示a new uvcvideo driver has been registered





安装需要的包
sudo apt-get install libusb-1.0-0-dev pkg-config libgtk-3-dev
sudo apt-get install libglfw3-dev


//TM1-specifics
//echo 'hid_sensor_custom' | sudo tee -a /etc/modules`


SDK
//sudo add-apt-repository ppa:ubuntu-toolchain-r/test
//sudo apt-get update
cd '/home/qiuyilin/librealsense'  
mkdir build && cd build

sudo cmake ../
sudo cmake ../ -DBUILD_EXAMPLES=true


sudo make uninstall && make clean && make -j8 && sudo make install(权限不够就用su)



The shared object will be installed in /usr/local/lib, header files in /usr/local/include
The demos, tutorials and tests will be located in /usr/local/bin



ROS
https://github.com/intel-ros/realsense
cd ~/catkin_ws/src/
粘贴源码
catkin_init_workspace 
cd ..
catkin_make clean
catkin_make -DCATKIN_ENABLE_TESTING=False -DCMAKE_BUILD_TYPE=Release
catkin_make install
echo "source ~/catkin_ws/devel/setup.bash" >> ~/.bashrc
source ~/.bashrc

用法
roslaunch realsense2_camera rs_camera.launch
开启所有相机传感器（rviz可见）
roslaunch realsense2_camera rs_rgbd.launch
开启相机节点并发布rgbd点云
roslaunch realsense2_camera rs_aligned_depth.launch
开启相机节点 向一个传感器对齐
rosrun rqt_reconfigure rqt_reconfigure
调整相机参数
roslaunch realsense2_camera rs_camera.launch filters:=temporal,spatial,pointcloud
后处理滤波




