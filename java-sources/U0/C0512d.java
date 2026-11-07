package U0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: U0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0512d implements Appendable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final StringBuilder f8052r = new StringBuilder(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f8053s;

    public C0512d(C0515g c0515g) {
        new ArrayList();
        this.f8053s = new ArrayList();
        new ArrayList();
        a(c0515g);
    }

    public final void a(C0515g c0515g) {
        StringBuilder sb = this.f8052r;
        int length = sb.length();
        sb.append(c0515g.f8060s);
        List list = c0515g.f8059r;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0513e c0513e = (C0513e) list.get(i10);
                this.f8053s.add(new C0511c(c0513e.f8054a, c0513e.f8055b + length, c0513e.f8056c + length, c0513e.f8057d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0515g) {
            a((C0515g) charSequence);
            return this;
        }
        this.f8052r.append(charSequence);
        return this;
    }

    public final C0515g b() {
        StringBuilder sb = this.f8052r;
        String string = sb.toString();
        ArrayList arrayList = this.f8053s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C0511c) arrayList.get(i10)).a(sb.length()));
        }
        return new C0515g(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        boolean z10 = charSequence instanceof C0515g;
        StringBuilder sb = this.f8052r;
        if (z10) {
            C0515g c0515g = (C0515g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0515g.f8060s, i10, i11);
            List listA = AbstractC0517i.a(c0515g, i10, i11, null);
            if (listA != null) {
                int size = listA.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C0513e c0513e = (C0513e) listA.get(i12);
                    this.f8053s.add(new C0511c(c0513e.f8054a, c0513e.f8055b + length, c0513e.f8056c + length, c0513e.f8057d));
                }
            }
            return this;
        }
        sb.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        this.f8052r.append(c10);
        return this;
    }
}
