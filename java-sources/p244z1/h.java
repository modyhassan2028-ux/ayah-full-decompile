package p244z1;

import android.content.res.Resources;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f24768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f24769b;

    public h(Resources resources, Resources.Theme theme) {
        this.f24768a = resources;
        this.f24769b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f24768a.equals(hVar.f24768a) && Objects.equals(this.f24769b, hVar.f24769b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f24768a, this.f24769b);
    }
}
