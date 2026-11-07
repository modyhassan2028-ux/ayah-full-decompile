package p013b2;

import U6.C0532j;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0532j {
    @Override // U6.C0532j
    public final Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
