package T1;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E f7579r = new E(1);

    @Override // p241y9.c
    public final Object e(Object obj) {
        File file = (File) obj;
        p251z9.j.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        p251z9.j.d(absolutePath, "file.canonicalFile.absolutePath");
        return new c0(absolutePath);
    }
}
