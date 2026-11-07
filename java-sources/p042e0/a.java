package p042e0;

import java.util.Map;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f15712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15713t;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f15711r = i10;
        this.f15712s = obj;
        this.f15713t = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f15711r) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && j.a(entry.getKey(), this.f15712s) && j.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f15711r) {
            case 0:
                break;
        }
        return this.f15712s;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f15711r) {
            case 0:
                break;
        }
        return this.f15713t;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f15711r) {
            case 0:
                Object obj = this.f15712s;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f15711r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f15711r) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f15712s);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
