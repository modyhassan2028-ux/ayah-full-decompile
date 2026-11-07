package p120l9;

import A9.b;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends AbstractList implements List, b {
    public abstract int b();

    public abstract Object c(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return c(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
