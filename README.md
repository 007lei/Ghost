# Ghost

微影，一款纯粹的在线视频App，基于Material Design + MVP + RxJava + Retrofit + Realm + Glide

##更改日志
####2016.9.20
* 1.完成精选、专题、发现界面
* 2.节目详情界面完成
* 3.播放器界面完成


##去做
* 1.搜索界面
* 2.将详情界面修改成Material Design控件样式
* 3.新增图片抽象层，不管底层具体调用
* 4.历史、缓存、收藏功能


#技术点
* 使用RxJava配合Retrofit2做网络请求
* 使用RxUtil对线程操作和网络请求结果处理做了封装
* 使用RxPresenter对订阅的生命周期做管理
* 使用AndroidEventBus来方便组件间的通信
* 使用Material Design控件和动画
* 使用MVP架构整个项目，对应于model、ui、presenter三个包
* 使用Realm做阅读记录和收藏记录的增、删、查、改
* 使用Glide做图片的处理和加载
* 使用RecyclerView实现下拉刷新、上拉加载、侧滑删除、长按拖曳
* 支持主题设置
* 包含搜索、收藏、历史等功能

###RES:
[iconfont](http://www.iconfont.cn/) 提供了icon素材

[material UP](http://www.material.uplabs.com/) 提供了Material Design风格的素材

###LIB:
####UI
* [MaterialSearchView](https://github.com/MiguelCatalan/MaterialSearchView)
* [multiline-collapsingtoolbar](https://github.com/opacapp/multiline-collapsingtoolbar)


####RX

* [RxJava](https://github.com/ReactiveX/RxJava)
* [RxAndroid](https://github.com/ReactiveX/RxAndroid)
* [RxBinding](https://github.com/JakeWharton/RxBinding)

####NETWORK

* [Gson](https://github.com/google/gson)
* [Retrofit](https://github.com/square/retrofit)
* [OkHttp](https://github.com/square/okhttp)
* [Glide](https://github.com/bumptech/glide)

####DI
* [ButterKnife](https://github.com/JakeWharton/butterknife)

####FRAGMENT

* [Fragmentation](https://github.com/YoKeyword/Fragmentation)

####LOG

* [Logger](https://github.com/orhanobut/logger)

####DB

* [Realm](https://github.com/realm/realm-java)

####CANARY

* [BlockCanary](https://github.com/markzhai/AndroidPerformanceMonitor)
* [LeakCanary](https://github.com/square/leakcanary)


##License

Copyright (c) 2016 codeestX

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.