package v9;

import java.io.File;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f23390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23391d;

    @Override // v9.e
    public final File a() {
        boolean z10 = this.f23389b;
        File file = this.f23392a;
        if (!z10) {
            this.f23389b = true;
            return file;
        }
        File[] fileArr = this.f23390c;
        if (fileArr != null && this.f23391d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f23390c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f23390c;
        j.b(fileArr2);
        int i10 = this.f23391d;
        this.f23391d = i10 + 1;
        return fileArr2[i10];
    }
}
