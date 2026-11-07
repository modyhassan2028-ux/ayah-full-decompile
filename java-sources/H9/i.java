package H9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p093j0.y;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p120l9.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3633s;

    public /* synthetic */ i(int i10, Object obj) {
        this.f3632r = i10;
        this.f3633s = obj;
    }

    @Override // p120l9.a
    public final int b() {
        switch (this.f3632r) {
            case 0:
                return ((k) this.f3633s).f3636a.groupCount() + 1;
            default:
                return ((List) this.f3633s).size();
        }
    }

    @Override // p120l9.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f3632r) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f3632r) {
            case 0:
                String strGroup = ((k) this.f3633s).f3636a.group(i10);
                return strGroup == null ? "" : strGroup;
            default:
                List list = (List) this.f3633s;
                if (i10 >= 0 && i10 <= AbstractC0813f2.E(this)) {
                    return list.get(AbstractC0813f2.E(this) - i10);
                }
                StringBuilder sbW = p123m2.c.w(i10, "Element index ", " must be in range [");
                sbW.append(new E9.d(0, AbstractC0813f2.E(this), 1));
                sbW.append("].");
                throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // p120l9.d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f3632r) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p120l9.d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f3632r) {
            case 1:
                return new y(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p120l9.d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f3632r) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p120l9.d, java.util.List
    public ListIterator listIterator() {
        switch (this.f3632r) {
            case 1:
                return new y(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // p120l9.d, java.util.List
    public ListIterator listIterator(int i10) {
        switch (this.f3632r) {
            case 1:
                return new y(this, i10);
            default:
                return super.listIterator(i10);
        }
    }
}
