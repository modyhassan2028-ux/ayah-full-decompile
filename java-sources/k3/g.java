package k3;

import com.ayah.common.data.dao.notification.ReminderDestination;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReminderDestination f18976c;

    public g(int i10, String str, ReminderDestination reminderDestination) {
        this.f18974a = i10;
        this.f18975b = str;
        this.f18976c = reminderDestination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f18974a == gVar.f18974a && p251z9.j.a(this.f18975b, gVar.f18975b) && p251z9.j.a(this.f18976c, gVar.f18976c);
    }

    public final int hashCode() {
        return this.f18976c.hashCode() + p245z2.a.x(this.f18975b, this.f18974a * 31, 31);
    }

    public final String toString() {
        return "CustomType(identifier=" + this.f18974a + ", name=" + this.f18975b + ", destination=" + this.f18976c + ")";
    }
}
