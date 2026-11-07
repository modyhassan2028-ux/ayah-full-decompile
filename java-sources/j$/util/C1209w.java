package j$.util;

import java.util.Set;

/* JADX INFO: renamed from: j$.util.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1209w extends C1073n implements Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.f18199a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18199a.hashCode();
    }
}
