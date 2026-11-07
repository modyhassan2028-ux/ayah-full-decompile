package F1;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2155c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f2153a, eVar.f2153a) && Objects.equals(this.f2154b, eVar.f2154b) && Objects.equals(this.f2155c, eVar.f2155c);
    }

    public final int hashCode() {
        return Objects.hash(this.f2153a, this.f2154b, this.f2155c);
    }
}
