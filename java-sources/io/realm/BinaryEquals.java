package io.realm;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class BinaryEquals<K> extends EqualsHelper<K, byte[]> {
    @Override // io.realm.EqualsHelper
    public boolean compareInternal(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }
}
