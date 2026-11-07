package j$.util;

/* JADX INFO: renamed from: j$.util.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1066g extends RuntimeException {
    public static void a(Object obj, String str) {
        throw new C1066g("Unsupported " + str + " :" + obj);
    }
}
