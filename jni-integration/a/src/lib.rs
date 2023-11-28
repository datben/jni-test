
extern crate jni;
use jni::sys::*;
use jni::JNIEnv;
use jni::objects::JObject;

#[no_mangle]
pub extern "system" fn jni_a(env: JNIEnv, _object: JObject, _a: jbyteArray) -> jbyteArray {
    std::ptr::null_mut()
}
