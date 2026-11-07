package p160p8;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21072a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f21072a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
