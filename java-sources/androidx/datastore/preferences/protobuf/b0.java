package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.M2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import u.C1348c;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends AbstractSet {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map f12435s;

    public /* synthetic */ b0(Map map, int i10) {
        this.f12434r = i10;
        this.f12435s = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f12434r) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((Y) this.f12435s).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((M2) this.f12435s).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f12434r) {
            case 0:
                ((Y) this.f12435s).clear();
                break;
            case 1:
                ((M2) this.f12435s).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f12434r) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((Y) this.f12435s).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((M2) this.f12435s).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f12434r) {
            case 0:
                return new a0((Y) this.f12435s);
            case 1:
                return new a0((M2) this.f12435s);
            default:
                return new C1348c((C1350e) this.f12435s);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f12434r) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((Y) this.f12435s).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((M2) this.f12435s).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f12434r) {
            case 0:
                return ((Y) this.f12435s).size();
            case 1:
                return ((M2) this.f12435s).size();
            default:
                return ((C1350e) this.f12435s).f22703t;
        }
    }
}
