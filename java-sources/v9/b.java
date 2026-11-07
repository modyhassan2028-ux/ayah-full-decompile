package v9;

import java.io.File;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f23385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23387e;

    @Override // v9.e
    public final File a() {
        boolean z10 = this.f23387e;
        File file = this.f23392a;
        if (!z10 && this.f23385c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f23385c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f23387e = true;
            }
        }
        File[] fileArr = this.f23385c;
        if (fileArr == null || this.f23386d >= fileArr.length) {
            if (this.f23384b) {
                return null;
            }
            this.f23384b = true;
            return file;
        }
        j.b(fileArr);
        int i10 = this.f23386d;
        this.f23386d = i10 + 1;
        return fileArr[i10];
    }
}
