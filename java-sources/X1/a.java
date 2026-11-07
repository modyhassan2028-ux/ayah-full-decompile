package X1;

import java.util.Map;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f9842r = new a(1);

    @Override // p241y9.c
    public final Object e(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i10 = 0;
            for (byte b5 : (byte[]) value) {
                i10++;
                if (i10 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b5));
            }
            sb.append((CharSequence) "]");
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((e) entry.getKey()).f9850a + " = " + strValueOf;
    }
}
