package io.realm.internal.android;

/* JADX INFO: loaded from: classes.dex */
public class TypeUtils {
    public static byte[] convertNonPrimitiveBinaryToPrimitive(Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            Byte b5 = bArr[i10];
            if (b5 == null) {
                throw new IllegalArgumentException("Byte arrays cannot contain null values.");
            }
            bArr2[i10] = b5.byteValue();
        }
        return bArr2;
    }

    public static Byte[] convertPrimitiveBinaryToNonPrimitive(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }
}
