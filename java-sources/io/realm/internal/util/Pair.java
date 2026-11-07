package io.realm.internal.util;

/* JADX INFO: loaded from: classes.dex */
public class Pair<F, S> {
    public F first;
    public S second;

    public Pair(F f3, S s10) {
        this.first = f3;
        this.second = s10;
    }

    public static <A, B> Pair<A, B> create(A a9, B b5) {
        return new Pair<>(a9, b5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return equals(pair.first, this.first) && equals(pair.second, this.second);
    }

    public int hashCode() {
        F f3 = this.first;
        int iHashCode = f3 == null ? 0 : f3.hashCode();
        S s10 = this.second;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.first) + " " + String.valueOf(this.second) + "}";
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
