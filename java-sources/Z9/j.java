package Z9;

import Y9.C0667x;
import Y9.M;
import Y9.Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0667x f11052a = M.a(Z.f10495a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final w a(i iVar) {
        w wVar = iVar instanceof w ? (w) iVar : null;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException("Element " + p251z9.w.a(iVar.getClass()) + " is not a JsonPrimitive");
    }
}
