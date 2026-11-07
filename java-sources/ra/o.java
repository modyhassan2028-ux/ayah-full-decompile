package ra;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f21693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f21694s;

    public o(p pVar, t tVar) {
        this.f21694s = pVar;
        this.f21693r = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ra.p] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ra.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p241y9.a
    public final Object invoke() throws Throwable {
        Throwable th;
        EnumC1290b enumC1290b;
        ?? r10 = this.f21694s;
        t tVar = this.f21693r;
        EnumC1290b enumC1290b2 = EnumC1290b.INTERNAL_ERROR;
        ?? r11 = 1;
        IOException e10 = null;
        try {
            try {
                try {
                    if (!tVar.b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } while (tVar.b(false, this));
                    enumC1290b = EnumC1290b.NO_ERROR;
                    try {
                        enumC1290b2 = EnumC1290b.CANCEL;
                        r10.b(enumC1290b, enumC1290b2, null);
                        r11 = enumC1290b;
                    } catch (IOException e11) {
                        e10 = e11;
                        enumC1290b2 = EnumC1290b.PROTOCOL_ERROR;
                        r10.b(enumC1290b2, enumC1290b2, e10);
                        r11 = enumC1290b;
                    }
                    la.c.a(tVar);
                    return p110k9.y.f19095a;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e12) {
                e10 = e12;
                enumC1290b = enumC1290b2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        r11 = enumC1290b2;
        r10.b(r11, enumC1290b2, e10);
        la.c.a(tVar);
        throw th;
    }
}
