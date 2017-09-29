/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\����\\Desktop\\PrinterTestDemo\\src\\woyou\\aidlservice\\jiuiv5\\IWoyouService.aidl
 */
package woyou.aidlservice.jiuiv5;
public interface IWoyouService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements woyou.aidlservice.jiuiv5.IWoyouService
{
private static final java.lang.String DESCRIPTOR = "woyou.aidlservice.jiuiv5.IWoyouService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an woyou.aidlservice.jiuiv5.IWoyouService interface,
 * generating a proxy if needed.
 */
public static woyou.aidlservice.jiuiv5.IWoyouService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof woyou.aidlservice.jiuiv5.IWoyouService))) {
return ((woyou.aidlservice.jiuiv5.IWoyouService)iin);
}
return new woyou.aidlservice.jiuiv5.IWoyouService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_updateFirmware:
{
data.enforceInterface(DESCRIPTOR);
this.updateFirmware();
reply.writeNoException();
return true;
}
case TRANSACTION_getFirmwareStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getFirmwareStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getServiceVersion:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getServiceVersion();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_printerInit:
{
data.enforceInterface(DESCRIPTOR);
woyou.aidlservice.jiuiv5.ICallback _arg0;
_arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printerInit(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_printerSelfChecking:
{
data.enforceInterface(DESCRIPTOR);
woyou.aidlservice.jiuiv5.ICallback _arg0;
_arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printerSelfChecking(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPrinterSerialNo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPrinterSerialNo();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPrinterVersion:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPrinterVersion();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPrinterModal:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPrinterModal();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getPrintedLength:
{
data.enforceInterface(DESCRIPTOR);
woyou.aidlservice.jiuiv5.ICallback _arg0;
_arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.getPrintedLength(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_lineWrap:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.lineWrap(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_sendRAWData:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.sendRAWData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAlignment:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.setAlignment(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setFontName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.setFontName(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setFontSize:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.setFontSize(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_printText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printText(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_printTextWithFont:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
float _arg2;
_arg2 = data.readFloat();
woyou.aidlservice.jiuiv5.ICallback _arg3;
_arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printTextWithFont(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_printColumnsText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
int[] _arg1;
_arg1 = data.createIntArray();
int[] _arg2;
_arg2 = data.createIntArray();
woyou.aidlservice.jiuiv5.ICallback _arg3;
_arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printColumnsText(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_printBitmap:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printBitmap(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_printBarCode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg5;
_arg5 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printBarCode(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_printQRCode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
woyou.aidlservice.jiuiv5.ICallback _arg3;
_arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printQRCode(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_printOriginalText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
woyou.aidlservice.jiuiv5.ICallback _arg1;
_arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
this.printOriginalText(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_commitPrinterBuffer:
{
data.enforceInterface(DESCRIPTOR);
this.commitPrinterBuffer();
reply.writeNoException();
return true;
}
case TRANSACTION_enterPrinterBuffer:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.enterPrinterBuffer(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_exitPrinterBuffer:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.exitPrinterBuffer(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements woyou.aidlservice.jiuiv5.IWoyouService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
	* 打印机固件升级(只供系统组件调用,开发者调用无效)
	* @param buffer			
	* @param size
	* @param filename
	* @param iapInterface
	*/
@Override public void updateFirmware() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateFirmware, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印机固件状态
	* return:   0--未知， A5--bootloader, C3--print
	*/
@Override public int getFirmwareStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFirmwareStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 取WoyouService服务版本
	*/
@Override public java.lang.String getServiceVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	 * 初始化打印机，重置打印机的逻辑程序，但不清空缓存区数据，因此
	 * 未完成的打印作业将在重置后继续
	 * @param callback 回调
	 * @return
	 */
@Override public void printerInit(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printerInit, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印机自检，打印机会打印自检页
	* @param callback 回调
	*/
@Override public void printerSelfChecking(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printerSelfChecking, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 获取打印机板序列号
	*/
@Override public java.lang.String getPrinterSerialNo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrinterSerialNo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 获取打印机固件版本号
	*/
@Override public java.lang.String getPrinterVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrinterVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 获取打印机型号
	*/
@Override public java.lang.String getPrinterModal() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrinterModal, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	* 获取打印头打印长度
	*/
@Override public void getPrintedLength(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getPrintedLength, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	 * 打印机走纸(强制换行，结束之前的打印内容后走纸n行)
	 * @param n:	走纸行数
	 * @param callback  结果回调
	 * @return
	 */
@Override public void lineWrap(int n, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(n);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_lineWrap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 使用原始指令打印
	* @param data	        指令
	* @param callback  结果回调
	*/
@Override public void sendRAWData(byte[] data, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(data);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_sendRAWData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 设置对齐模式，对之后打印有影响，除非初始化
	* @param alignment:	对齐方式 0--居左 , 1--居中, 2--居右
	* @param callback  结果回调
	*/
@Override public void setAlignment(int alignment, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(alignment);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setAlignment, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 设置打印字体, 对之后打印有影响，除非初始化
	* (目前只支持一种字体"gh"，gh是一种等宽中文字体，之后会提供更多字体选择)
	* @param typeface:		字体名称
	*/
@Override public void setFontName(java.lang.String typeface, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(typeface);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setFontName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 设置字体大小, 对之后打印有影响，除非初始化
	* 注意：字体大小是超出标准国际指令的打印方式，
	* 调整字体大小会影响字符宽度，每行字符数量也会随之改变，
	* 因此按等宽字体形成的排版可能会错乱
	* @param fontsize:	字体大小
	*/
@Override public void setFontSize(float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(fontsize);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setFontSize, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
	* @param text:	要打印的文字字符串
	*/
@Override public void printText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印指定字体的文本，字体设置只对本次有效
	* @param text:			要打印文字
	* @param typeface:		字体名称（目前只支持"gh"字体）
	* @param fontsize:		字体大小	
	*/
@Override public void printTextWithFont(java.lang.String text, java.lang.String typeface, float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
_data.writeString(typeface);
_data.writeFloat(fontsize);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printTextWithFont, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印表格的一行，可以指定列宽、对齐方式
	* @param colsTextArr   各列文本字符串数组
	* @param colsWidthArr  各列宽度数组(以英文字符计算, 每个中文字符占两个英文字符, 每个宽度大于0)
	* @param colsAlign	        各列对齐方式(0居左, 1居中, 2居右)
	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
	*/
@Override public void printColumnsText(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(colsTextArr);
_data.writeIntArray(colsWidthArr);
_data.writeIntArray(colsAlign);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printColumnsText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印图片
	* @param bitmap: 	图片bitmap对象(最大宽度384像素，超过无法打印并且回调callback异常函数)
	*/
@Override public void printBitmap(android.graphics.Bitmap bitmap, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((bitmap!=null)) {
_data.writeInt(1);
bitmap.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printBitmap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印一维条码
	* @param data: 		条码数据
	* @param symbology: 	条码类型
	*    0 -- UPC-A，
	*    1 -- UPC-E，
	*    2 -- JAN13(EAN13)，
	*    3 -- JAN8(EAN8)，
	*    4 -- CODE39，
	*    5 -- ITF，
	*    6 -- CODABAR，
	*    7 -- CODE93，
	*    8 -- CODE128
	* @param height: 		条码高度, 取值1到255, 默认162
	* @param width: 		条码宽度, 取值2至6, 默认2
	* @param textposition:	文字位置 0--不打印文字, 1--文字在条码上方, 2--文字在条码下方, 3--条码上下方均打印
	*/
@Override public void printBarCode(java.lang.String data, int symbology, int height, int width, int textposition, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
_data.writeInt(symbology);
_data.writeInt(height);
_data.writeInt(width);
_data.writeInt(textposition);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印二维条码
	* @param data:			二维码数据
	* @param modulesize:	二维码块大小(单位:点, 取值 1 至 16 )
	* @param errorlevel:	二维码纠错等级(0 至 3)，
	*                0 -- 纠错级别L ( 7%)，
	*                1 -- 纠错级别M (15%)，
	*                2 -- 纠错级别Q (25%)，
	*                3 -- 纠错级别H (30%) 
	*/
@Override public void printQRCode(java.lang.String data, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
_data.writeInt(modulesize);
_data.writeInt(errorlevel);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printQRCode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
	* 文字按矢量文字宽度原样输出，即每个字符不等宽
	* @param text:	要打印的文字字符串
	* 
	*/
@Override public void printOriginalText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_printOriginalText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 打印缓冲区内容
	*/
@Override public void commitPrinterBuffer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_commitPrinterBuffer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 进入缓冲模式，所有打印调用将缓存，调用commitPrinterBuffe()后打印
	* 
	* @param clean: 是否清除缓冲区内容
	* 
	*/
@Override public void enterPrinterBuffer(boolean clean) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((clean)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enterPrinterBuffer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	* 退出缓冲模式
	* 
	* @param commit: 是否打印出缓冲区内容
	* 
	*/
@Override public void exitPrinterBuffer(boolean commit) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((commit)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_exitPrinterBuffer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_updateFirmware = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getFirmwareStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_printerInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_printerSelfChecking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPrinterSerialNo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getPrinterVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getPrinterModal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getPrintedLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_lineWrap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_sendRAWData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setAlignment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setFontSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_printTextWithFont = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_printColumnsText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_printBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_printQRCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_printOriginalText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_commitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_enterPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_exitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
}
/**
	* 打印机固件升级(只供系统组件调用,开发者调用无效)
	* @param buffer			
	* @param size
	* @param filename
	* @param iapInterface
	*/
public void updateFirmware() throws android.os.RemoteException;
/**
	* 打印机固件状态
	* return:   0--未知， A5--bootloader, C3--print
	*/
public int getFirmwareStatus() throws android.os.RemoteException;
/**
	* 取WoyouService服务版本
	*/
public java.lang.String getServiceVersion() throws android.os.RemoteException;
/**
	 * 初始化打印机，重置打印机的逻辑程序，但不清空缓存区数据，因此
	 * 未完成的打印作业将在重置后继续
	 * @param callback 回调
	 * @return
	 */
public void printerInit(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印机自检，打印机会打印自检页
	* @param callback 回调
	*/
public void printerSelfChecking(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 获取打印机板序列号
	*/
public java.lang.String getPrinterSerialNo() throws android.os.RemoteException;
/**
	* 获取打印机固件版本号
	*/
public java.lang.String getPrinterVersion() throws android.os.RemoteException;
/**
	* 获取打印机型号
	*/
public java.lang.String getPrinterModal() throws android.os.RemoteException;
/**
	* 获取打印头打印长度
	*/
public void getPrintedLength(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	 * 打印机走纸(强制换行，结束之前的打印内容后走纸n行)
	 * @param n:	走纸行数
	 * @param callback  结果回调
	 * @return
	 */
public void lineWrap(int n, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 使用原始指令打印
	* @param data	        指令
	* @param callback  结果回调
	*/
public void sendRAWData(byte[] data, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 设置对齐模式，对之后打印有影响，除非初始化
	* @param alignment:	对齐方式 0--居左 , 1--居中, 2--居右
	* @param callback  结果回调
	*/
public void setAlignment(int alignment, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 设置打印字体, 对之后打印有影响，除非初始化
	* (目前只支持一种字体"gh"，gh是一种等宽中文字体，之后会提供更多字体选择)
	* @param typeface:		字体名称
	*/
public void setFontName(java.lang.String typeface, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 设置字体大小, 对之后打印有影响，除非初始化
	* 注意：字体大小是超出标准国际指令的打印方式，
	* 调整字体大小会影响字符宽度，每行字符数量也会随之改变，
	* 因此按等宽字体形成的排版可能会错乱
	* @param fontsize:	字体大小
	*/
public void setFontSize(float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
	* @param text:	要打印的文字字符串
	*/
public void printText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印指定字体的文本，字体设置只对本次有效
	* @param text:			要打印文字
	* @param typeface:		字体名称（目前只支持"gh"字体）
	* @param fontsize:		字体大小	
	*/
public void printTextWithFont(java.lang.String text, java.lang.String typeface, float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印表格的一行，可以指定列宽、对齐方式
	* @param colsTextArr   各列文本字符串数组
	* @param colsWidthArr  各列宽度数组(以英文字符计算, 每个中文字符占两个英文字符, 每个宽度大于0)
	* @param colsAlign	        各列对齐方式(0居左, 1居中, 2居右)
	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
	*/
public void printColumnsText(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印图片
	* @param bitmap: 	图片bitmap对象(最大宽度384像素，超过无法打印并且回调callback异常函数)
	*/
public void printBitmap(android.graphics.Bitmap bitmap, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印一维条码
	* @param data: 		条码数据
	* @param symbology: 	条码类型
	*    0 -- UPC-A，
	*    1 -- UPC-E，
	*    2 -- JAN13(EAN13)，
	*    3 -- JAN8(EAN8)，
	*    4 -- CODE39，
	*    5 -- ITF，
	*    6 -- CODABAR，
	*    7 -- CODE93，
	*    8 -- CODE128
	* @param height: 		条码高度, 取值1到255, 默认162
	* @param width: 		条码宽度, 取值2至6, 默认2
	* @param textposition:	文字位置 0--不打印文字, 1--文字在条码上方, 2--文字在条码下方, 3--条码上下方均打印
	*/
public void printBarCode(java.lang.String data, int symbology, int height, int width, int textposition, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印二维条码
	* @param data:			二维码数据
	* @param modulesize:	二维码块大小(单位:点, 取值 1 至 16 )
	* @param errorlevel:	二维码纠错等级(0 至 3)，
	*                0 -- 纠错级别L ( 7%)，
	*                1 -- 纠错级别M (15%)，
	*                2 -- 纠错级别Q (25%)，
	*                3 -- 纠错级别H (30%) 
	*/
public void printQRCode(java.lang.String data, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
	* 文字按矢量文字宽度原样输出，即每个字符不等宽
	* @param text:	要打印的文字字符串
	* 
	*/
public void printOriginalText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
/**
	* 打印缓冲区内容
	*/
public void commitPrinterBuffer() throws android.os.RemoteException;
/**
	* 进入缓冲模式，所有打印调用将缓存，调用commitPrinterBuffe()后打印
	* 
	* @param clean: 是否清除缓冲区内容
	* 
	*/
public void enterPrinterBuffer(boolean clean) throws android.os.RemoteException;
/**
	* 退出缓冲模式
	* 
	* @param commit: 是否打印出缓冲区内容
	* 
	*/
public void exitPrinterBuffer(boolean commit) throws android.os.RemoteException;
}
