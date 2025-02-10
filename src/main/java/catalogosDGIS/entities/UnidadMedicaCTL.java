package catalogosDGIS.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidad_medica_ctl")
public class UnidadMedicaCTL {

    @Id
    @Basic(optional = false)
    @Column(name = "id_establecimiento")
    private Integer idEstablecimiento;
    @Column(name = "clues")
    private String clues;
    @Column(name = "nombre_entidad")
    private String nombreEntidad;
    @Column(name = "clave_entidad")
    private String claveEntidad;
    @Column(name = "nombre_municipio")
    private String nombreMunicipio;
    @Column(name = "clave_municipio")
    private String claveMunicipio;
    @Column(name = "nombre_localidad")
    private String nombreLocalidad;
    @Column(name = "clave_localidad")
    private String claveLocalidad;
    @Column(name = "nombre_jurisdiccion")
    private String nombreJurisdiccion;
    @Column(name = "clave_jurisdiccion")
    private String claveJurisdiccion;
    @Column(name = "nombre_institucion")
    private String nombreInstitucion;
    @Column(name = "clave_institucion")
    private String claveInstitucion;
    @Column(name = "nombre_tipo_establecimiento")
    private String nombreTipoEstablecimiento;
    @Column(name = "clave_tipo_establecimiento")
    private String claveTipoEstablecimiento;
    @Column(name = "nombre_tipologia")
    private String nombreTipologia;
    @Column(name = "clave_tipologia")
    private String claveTipologia;
    @Column(name = "nombre_subtipologia")
    private String nombreSubtipologia;
    @Column(name = "clave_subtipologia")
    private String claveSubtipologia;
    @Column(name = "clave_scian")
    private String claveScian;
    @Column(name = "descripcion_clav_scian")
    private String descripcionClavScian;
    @Column(name = "consultorios_medgral")
    private Integer consultoriosMedgral;
    @Column(name = "consultorios_otrasareas")
    private Integer consultoriosOtrasareas;
    @Column(name = "total_consultorios")
    private Integer totalConsultorios;
    @Column(name = "camas_area_hos")
    private Integer camasAreaHos;
    @Column(name = "camas_otras_areas")
    private Integer camasOtrasAreas;
    @Column(name = "total_camas")
    private Integer totalCamas;
    @Column(name = "nombre_unidad")
    private String nombreUnidad;
    @Column(name = "clave_vialidad")
    private String claveVialidad;
    @Column(name = "tipo_vialidad")
    private String tipoVialidad;
    @Column(name = "vialidad")
    private String vialidad;
    @Column(name = "numero_exterior")
    private String numeroExterior;
    @Column(name = "numero_interior")
    private String numeroInterior;
    @Column(name = "clave_tipo_asentamiento")
    private String claveTipoAsentamiento;
    @Column(name = "tipo_asentamiento")
    private String tipoAsentamiento;
    @Column(name = "asentamiento")
    private String asentamiento;
    @Column(name = "entre_tipo_vialidad_1")
    private String entreTipoVialidad1;
    @Column(name = "entre_vialidad_1")
    private String entreVialidad1;
    @Column(name = "entre_tipo_vialidad_2")
    private String entreTipoVialidad2;
    @Column(name = "entre_vialidad_2")
    private String entreVialidad2;
    @Column(name = "observaciones_direccion")
    private String observacionesDireccion;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "estatus_operacion")
    private String estatusOperacion;
    @Column(name = "clave_estatus_operacion")
    private String claveEstatusOperacion;
    @Column(name = "licencia_sanitaria")
    private String licenciaSanitaria;
    @Column(name = "numero_licencia_sanitaria")
    private String numeroLicenciaSanitaria;
    @Column(name = "aviso_funcionamiento")
    private String avisoFuncionamiento;
    @Column(name = "fecha_emision")
    private String fechaEmision;
    @Column(name = "rfc_establecimiento")
    private String rfcEstablecimiento;
    @Column(name = "fecha_construccion")
    private String fechaConstruccion;
    @Column(name = "fecha_inicio_operacion")
    private String fechaInicioOperacion;
    @Column(name = "unidad_movil_marca")
    private String unidadMovilMarca;
    @Column(name = "unidad_movil_modelo")
    private String unidadMovilModelo;
    @Column(name = "unidad_movil_capacidad")
    private String unidadMovilCapacidad;
    @Column(name = "unidad_movil_programa")
    private String unidadMovilPrograma;
    @Column(name = "unidad_movi_clave_programa")
    private String unidadMoviClavePrograma;
    @Column(name = "unidad_movil_tipo")
    private String unidadMovilTipo;
    @Column(name = "unidad_movil_clave_tipo")
    private String unidadMovilClaveTipo;
    @Column(name = "unidad_movil_tipologia")
    private String unidadMovilTipologia;
    @Column(name = "unidad_movil_clave_tipologia")
    private String unidadMovilClaveTipologia;
    @Column(name = "latitud")
    private String latitud;
    @Column(name = "longitud")
    private String longitud;
    @Column(name = "nombre_ins_adm")
    private String nombreInsAdm;
    @Column(name = "clave_ins_adm")
    private String claveInsAdm;
    @Column(name = "nivel_atencion")
    private String nivelAtencion;
    @Column(name = "clave_nivel_atencion")
    private String claveNivelAtencion;
    @Column(name = "estatus_acreditacion")
    private String estatusAcreditacion;
    @Column(name = "clave_estatus_acreditacion")
    private String claveEstatusAcreditacion;
    @Column(name = "acreditaciones")
    private String acreditaciones;
    @Column(name = "subacreditacion")
    private String subacreditacion;
    @Column(name = "estrato_unidad")
    private String estratoUnidad;
    @Column(name = "clave_estrato_unidad")
    private String claveEstratoUnidad;
    @Column(name = "tipo_obra")
    private String tipoObra;
    @Column(name = "clave_tipo_obra")
    private String claveTipoObra;
    @Column(name = "horario_atencion")
    private String horarioAtencion;
    @Column(name = "areas_servicios")
    private String areasServicios;
    @Column(name = "ultimo_movimiento")
    private String ultimoMovimiento;
    @Column(name = "fecha_ultimo_movimiento")
    private String fechaUltimoMovimiento;
    @Column(name = "motivo_baja")
    private String motivoBaja;
    @Column(name = "fecha_efectiva_baja")
    private String fechaEfectivaBaja;
    @Column(name = "certificacion_csg")
    private String certificacionCsg;
    @Column(name = "tipo_certificacion")
    private String tipoCertificacion;
    @Column(name = "vigencia_certificacion")
    private String vigenciaCertificacion;
    @Column(name = "id")
    private Integer id;
    @Column(name = "estatus_unidad")
    private Integer estatusUnidad;

    public UnidadMedicaCTL() {
    }

    public UnidadMedicaCTL(Integer idEstablecimiento, String clues, String nombreEntidad, String claveEntidad, String nombreMunicipio, String claveMunicipio, String nombreLocalidad, String claveLocalidad, String nombreJurisdiccion, String claveJurisdiccion, String nombreInstitucion, String claveInstitucion, String nombreTipoEstablecimiento, String claveTipoEstablecimiento, String nombreTipologia, String claveTipologia, String nombreSubtipologia, String claveSubtipologia, String claveScian, String descripcionClavScian, Integer consultoriosMedgral, Integer consultoriosOtrasareas, Integer totalConsultorios, Integer camasAreaHos, Integer camasOtrasAreas, Integer totalCamas, String nombreUnidad, String claveVialidad, String tipoVialidad, String vialidad, String numeroExterior, String numeroInterior, String claveTipoAsentamiento, String tipoAsentamiento, String asentamiento, String entreTipoVialidad1, String entreVialidad1, String entreTipoVialidad2, String entreVialidad2, String observacionesDireccion, String codigoPostal, String estatusOperacion, String claveEstatusOperacion, String licenciaSanitaria, String numeroLicenciaSanitaria, String avisoFuncionamiento, String fechaEmision, String rfcEstablecimiento, String fechaConstruccion, String fechaInicioOperacion, String unidadMovilMarca, String unidadMovilModelo, String unidadMovilCapacidad, String unidadMovilPrograma, String unidadMoviClavePrograma, String unidadMovilTipo, String unidadMovilClaveTipo, String unidadMovilTipologia, String unidadMovilClaveTipologia, String latitud, String longitud, String nombreInsAdm, String claveInsAdm, String nivelAtencion, String claveNivelAtencion, String estatusAcreditacion, String claveEstatusAcreditacion, String acreditaciones, String subacreditacion, String estratoUnidad, String claveEstratoUnidad, String tipoObra, String claveTipoObra, String horarioAtencion, String areasServicios, String ultimoMovimiento, String fechaUltimoMovimiento, String motivoBaja, String fechaEfectivaBaja, String certificacionCsg, String tipoCertificacion, String vigenciaCertificacion, Integer id, Integer estatusUnidad) {
        this.idEstablecimiento = idEstablecimiento;
        this.clues = clues;
        this.nombreEntidad = nombreEntidad;
        this.claveEntidad = claveEntidad;
        this.nombreMunicipio = nombreMunicipio;
        this.claveMunicipio = claveMunicipio;
        this.nombreLocalidad = nombreLocalidad;
        this.claveLocalidad = claveLocalidad;
        this.nombreJurisdiccion = nombreJurisdiccion;
        this.claveJurisdiccion = claveJurisdiccion;
        this.nombreInstitucion = nombreInstitucion;
        this.claveInstitucion = claveInstitucion;
        this.nombreTipoEstablecimiento = nombreTipoEstablecimiento;
        this.claveTipoEstablecimiento = claveTipoEstablecimiento;
        this.nombreTipologia = nombreTipologia;
        this.claveTipologia = claveTipologia;
        this.nombreSubtipologia = nombreSubtipologia;
        this.claveSubtipologia = claveSubtipologia;
        this.claveScian = claveScian;
        this.descripcionClavScian = descripcionClavScian;
        this.consultoriosMedgral = consultoriosMedgral;
        this.consultoriosOtrasareas = consultoriosOtrasareas;
        this.totalConsultorios = totalConsultorios;
        this.camasAreaHos = camasAreaHos;
        this.camasOtrasAreas = camasOtrasAreas;
        this.totalCamas = totalCamas;
        this.nombreUnidad = nombreUnidad;
        this.claveVialidad = claveVialidad;
        this.tipoVialidad = tipoVialidad;
        this.vialidad = vialidad;
        this.numeroExterior = numeroExterior;
        this.numeroInterior = numeroInterior;
        this.claveTipoAsentamiento = claveTipoAsentamiento;
        this.tipoAsentamiento = tipoAsentamiento;
        this.asentamiento = asentamiento;
        this.entreTipoVialidad1 = entreTipoVialidad1;
        this.entreVialidad1 = entreVialidad1;
        this.entreTipoVialidad2 = entreTipoVialidad2;
        this.entreVialidad2 = entreVialidad2;
        this.observacionesDireccion = observacionesDireccion;
        this.codigoPostal = codigoPostal;
        this.estatusOperacion = estatusOperacion;
        this.claveEstatusOperacion = claveEstatusOperacion;
        this.licenciaSanitaria = licenciaSanitaria;
        this.numeroLicenciaSanitaria = numeroLicenciaSanitaria;
        this.avisoFuncionamiento = avisoFuncionamiento;
        this.fechaEmision = fechaEmision;
        this.rfcEstablecimiento = rfcEstablecimiento;
        this.fechaConstruccion = fechaConstruccion;
        this.fechaInicioOperacion = fechaInicioOperacion;
        this.unidadMovilMarca = unidadMovilMarca;
        this.unidadMovilModelo = unidadMovilModelo;
        this.unidadMovilCapacidad = unidadMovilCapacidad;
        this.unidadMovilPrograma = unidadMovilPrograma;
        this.unidadMoviClavePrograma = unidadMoviClavePrograma;
        this.unidadMovilTipo = unidadMovilTipo;
        this.unidadMovilClaveTipo = unidadMovilClaveTipo;
        this.unidadMovilTipologia = unidadMovilTipologia;
        this.unidadMovilClaveTipologia = unidadMovilClaveTipologia;
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombreInsAdm = nombreInsAdm;
        this.claveInsAdm = claveInsAdm;
        this.nivelAtencion = nivelAtencion;
        this.claveNivelAtencion = claveNivelAtencion;
        this.estatusAcreditacion = estatusAcreditacion;
        this.claveEstatusAcreditacion = claveEstatusAcreditacion;
        this.acreditaciones = acreditaciones;
        this.subacreditacion = subacreditacion;
        this.estratoUnidad = estratoUnidad;
        this.claveEstratoUnidad = claveEstratoUnidad;
        this.tipoObra = tipoObra;
        this.claveTipoObra = claveTipoObra;
        this.horarioAtencion = horarioAtencion;
        this.areasServicios = areasServicios;
        this.ultimoMovimiento = ultimoMovimiento;
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
        this.motivoBaja = motivoBaja;
        this.fechaEfectivaBaja = fechaEfectivaBaja;
        this.certificacionCsg = certificacionCsg;
        this.tipoCertificacion = tipoCertificacion;
        this.vigenciaCertificacion = vigenciaCertificacion;
        this.id = id;
        this.estatusUnidad = estatusUnidad;
    }

    public Integer getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(Integer idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public String getClues() {
        return clues;
    }

    public void setClues(String clues) {
        this.clues = clues;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getClaveEntidad() {
        return claveEntidad;
    }

    public void setClaveEntidad(String claveEntidad) {
        this.claveEntidad = claveEntidad;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getClaveMunicipio() {
        return claveMunicipio;
    }

    public void setClaveMunicipio(String claveMunicipio) {
        this.claveMunicipio = claveMunicipio;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public String getClaveLocalidad() {
        return claveLocalidad;
    }

    public void setClaveLocalidad(String claveLocalidad) {
        this.claveLocalidad = claveLocalidad;
    }

    public String getNombreJurisdiccion() {
        return nombreJurisdiccion;
    }

    public void setNombreJurisdiccion(String nombreJurisdiccion) {
        this.nombreJurisdiccion = nombreJurisdiccion;
    }

    public String getClaveJurisdiccion() {
        return claveJurisdiccion;
    }

    public void setClaveJurisdiccion(String claveJurisdiccion) {
        this.claveJurisdiccion = claveJurisdiccion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getClaveInstitucion() {
        return claveInstitucion;
    }

    public void setClaveInstitucion(String claveInstitucion) {
        this.claveInstitucion = claveInstitucion;
    }

    public String getNombreTipoEstablecimiento() {
        return nombreTipoEstablecimiento;
    }

    public void setNombreTipoEstablecimiento(String nombreTipoEstablecimiento) {
        this.nombreTipoEstablecimiento = nombreTipoEstablecimiento;
    }

    public String getClaveTipoEstablecimiento() {
        return claveTipoEstablecimiento;
    }

    public void setClaveTipoEstablecimiento(String claveTipoEstablecimiento) {
        this.claveTipoEstablecimiento = claveTipoEstablecimiento;
    }

    public String getNombreTipologia() {
        return nombreTipologia;
    }

    public void setNombreTipologia(String nombreTipologia) {
        this.nombreTipologia = nombreTipologia;
    }

    public String getClaveTipologia() {
        return claveTipologia;
    }

    public void setClaveTipologia(String claveTipologia) {
        this.claveTipologia = claveTipologia;
    }

    public String getNombreSubtipologia() {
        return nombreSubtipologia;
    }

    public void setNombreSubtipologia(String nombreSubtipologia) {
        this.nombreSubtipologia = nombreSubtipologia;
    }

    public String getClaveSubtipologia() {
        return claveSubtipologia;
    }

    public void setClaveSubtipologia(String claveSubtipologia) {
        this.claveSubtipologia = claveSubtipologia;
    }

    public String getClaveScian() {
        return claveScian;
    }

    public void setClaveScian(String claveScian) {
        this.claveScian = claveScian;
    }

    public String getDescripcionClavScian() {
        return descripcionClavScian;
    }

    public void setDescripcionClavScian(String descripcionClavScian) {
        this.descripcionClavScian = descripcionClavScian;
    }

    public Integer getConsultoriosMedgral() {
        return consultoriosMedgral;
    }

    public void setConsultoriosMedgral(Integer consultoriosMedgral) {
        this.consultoriosMedgral = consultoriosMedgral;
    }

    public Integer getConsultoriosOtrasareas() {
        return consultoriosOtrasareas;
    }

    public void setConsultoriosOtrasareas(Integer consultoriosOtrasareas) {
        this.consultoriosOtrasareas = consultoriosOtrasareas;
    }

    public Integer getTotalConsultorios() {
        return totalConsultorios;
    }

    public void setTotalConsultorios(Integer totalConsultorios) {
        this.totalConsultorios = totalConsultorios;
    }

    public Integer getCamasAreaHos() {
        return camasAreaHos;
    }

    public void setCamasAreaHos(Integer camasAreaHos) {
        this.camasAreaHos = camasAreaHos;
    }

    public Integer getCamasOtrasAreas() {
        return camasOtrasAreas;
    }

    public void setCamasOtrasAreas(Integer camasOtrasAreas) {
        this.camasOtrasAreas = camasOtrasAreas;
    }

    public Integer getTotalCamas() {
        return totalCamas;
    }

    public void setTotalCamas(Integer totalCamas) {
        this.totalCamas = totalCamas;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getClaveVialidad() {
        return claveVialidad;
    }

    public void setClaveVialidad(String claveVialidad) {
        this.claveVialidad = claveVialidad;
    }

    public String getTipoVialidad() {
        return tipoVialidad;
    }

    public void setTipoVialidad(String tipoVialidad) {
        this.tipoVialidad = tipoVialidad;
    }

    public String getVialidad() {
        return vialidad;
    }

    public void setVialidad(String vialidad) {
        this.vialidad = vialidad;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getClaveTipoAsentamiento() {
        return claveTipoAsentamiento;
    }

    public void setClaveTipoAsentamiento(String claveTipoAsentamiento) {
        this.claveTipoAsentamiento = claveTipoAsentamiento;
    }

    public String getTipoAsentamiento() {
        return tipoAsentamiento;
    }

    public void setTipoAsentamiento(String tipoAsentamiento) {
        this.tipoAsentamiento = tipoAsentamiento;
    }

    public String getAsentamiento() {
        return asentamiento;
    }

    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    public String getEntreTipoVialidad1() {
        return entreTipoVialidad1;
    }

    public void setEntreTipoVialidad1(String entreTipoVialidad1) {
        this.entreTipoVialidad1 = entreTipoVialidad1;
    }

    public String getEntreVialidad1() {
        return entreVialidad1;
    }

    public void setEntreVialidad1(String entreVialidad1) {
        this.entreVialidad1 = entreVialidad1;
    }

    public String getEntreTipoVialidad2() {
        return entreTipoVialidad2;
    }

    public void setEntreTipoVialidad2(String entreTipoVialidad2) {
        this.entreTipoVialidad2 = entreTipoVialidad2;
    }

    public String getEntreVialidad2() {
        return entreVialidad2;
    }

    public void setEntreVialidad2(String entreVialidad2) {
        this.entreVialidad2 = entreVialidad2;
    }

    public String getObservacionesDireccion() {
        return observacionesDireccion;
    }

    public void setObservacionesDireccion(String observacionesDireccion) {
        this.observacionesDireccion = observacionesDireccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEstatusOperacion() {
        return estatusOperacion;
    }

    public void setEstatusOperacion(String estatusOperacion) {
        this.estatusOperacion = estatusOperacion;
    }

    public String getClaveEstatusOperacion() {
        return claveEstatusOperacion;
    }

    public void setClaveEstatusOperacion(String claveEstatusOperacion) {
        this.claveEstatusOperacion = claveEstatusOperacion;
    }

    public String getLicenciaSanitaria() {
        return licenciaSanitaria;
    }

    public void setLicenciaSanitaria(String licenciaSanitaria) {
        this.licenciaSanitaria = licenciaSanitaria;
    }

    public String getNumeroLicenciaSanitaria() {
        return numeroLicenciaSanitaria;
    }

    public void setNumeroLicenciaSanitaria(String numeroLicenciaSanitaria) {
        this.numeroLicenciaSanitaria = numeroLicenciaSanitaria;
    }

    public String getAvisoFuncionamiento() {
        return avisoFuncionamiento;
    }

    public void setAvisoFuncionamiento(String avisoFuncionamiento) {
        this.avisoFuncionamiento = avisoFuncionamiento;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getRfcEstablecimiento() {
        return rfcEstablecimiento;
    }

    public void setRfcEstablecimiento(String rfcEstablecimiento) {
        this.rfcEstablecimiento = rfcEstablecimiento;
    }

    public String getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(String fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public String getFechaInicioOperacion() {
        return fechaInicioOperacion;
    }

    public void setFechaInicioOperacion(String fechaInicioOperacion) {
        this.fechaInicioOperacion = fechaInicioOperacion;
    }

    public String getUnidadMovilMarca() {
        return unidadMovilMarca;
    }

    public void setUnidadMovilMarca(String unidadMovilMarca) {
        this.unidadMovilMarca = unidadMovilMarca;
    }

    public String getUnidadMovilModelo() {
        return unidadMovilModelo;
    }

    public void setUnidadMovilModelo(String unidadMovilModelo) {
        this.unidadMovilModelo = unidadMovilModelo;
    }

    public String getUnidadMovilCapacidad() {
        return unidadMovilCapacidad;
    }

    public void setUnidadMovilCapacidad(String unidadMovilCapacidad) {
        this.unidadMovilCapacidad = unidadMovilCapacidad;
    }

    public String getUnidadMovilPrograma() {
        return unidadMovilPrograma;
    }

    public void setUnidadMovilPrograma(String unidadMovilPrograma) {
        this.unidadMovilPrograma = unidadMovilPrograma;
    }

    public String getUnidadMoviClavePrograma() {
        return unidadMoviClavePrograma;
    }

    public void setUnidadMoviClavePrograma(String unidadMoviClavePrograma) {
        this.unidadMoviClavePrograma = unidadMoviClavePrograma;
    }

    public String getUnidadMovilTipo() {
        return unidadMovilTipo;
    }

    public void setUnidadMovilTipo(String unidadMovilTipo) {
        this.unidadMovilTipo = unidadMovilTipo;
    }

    public String getUnidadMovilClaveTipo() {
        return unidadMovilClaveTipo;
    }

    public void setUnidadMovilClaveTipo(String unidadMovilClaveTipo) {
        this.unidadMovilClaveTipo = unidadMovilClaveTipo;
    }

    public String getUnidadMovilTipologia() {
        return unidadMovilTipologia;
    }

    public void setUnidadMovilTipologia(String unidadMovilTipologia) {
        this.unidadMovilTipologia = unidadMovilTipologia;
    }

    public String getUnidadMovilClaveTipologia() {
        return unidadMovilClaveTipologia;
    }

    public void setUnidadMovilClaveTipologia(String unidadMovilClaveTipologia) {
        this.unidadMovilClaveTipologia = unidadMovilClaveTipologia;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getNombreInsAdm() {
        return nombreInsAdm;
    }

    public void setNombreInsAdm(String nombreInsAdm) {
        this.nombreInsAdm = nombreInsAdm;
    }

    public String getClaveInsAdm() {
        return claveInsAdm;
    }

    public void setClaveInsAdm(String claveInsAdm) {
        this.claveInsAdm = claveInsAdm;
    }

    public String getNivelAtencion() {
        return nivelAtencion;
    }

    public void setNivelAtencion(String nivelAtencion) {
        this.nivelAtencion = nivelAtencion;
    }

    public String getClaveNivelAtencion() {
        return claveNivelAtencion;
    }

    public void setClaveNivelAtencion(String claveNivelAtencion) {
        this.claveNivelAtencion = claveNivelAtencion;
    }

    public String getEstatusAcreditacion() {
        return estatusAcreditacion;
    }

    public void setEstatusAcreditacion(String estatusAcreditacion) {
        this.estatusAcreditacion = estatusAcreditacion;
    }

    public String getClaveEstatusAcreditacion() {
        return claveEstatusAcreditacion;
    }

    public void setClaveEstatusAcreditacion(String claveEstatusAcreditacion) {
        this.claveEstatusAcreditacion = claveEstatusAcreditacion;
    }

    public String getAcreditaciones() {
        return acreditaciones;
    }

    public void setAcreditaciones(String acreditaciones) {
        this.acreditaciones = acreditaciones;
    }

    public String getSubacreditacion() {
        return subacreditacion;
    }

    public void setSubacreditacion(String subacreditacion) {
        this.subacreditacion = subacreditacion;
    }

    public String getEstratoUnidad() {
        return estratoUnidad;
    }

    public void setEstratoUnidad(String estratoUnidad) {
        this.estratoUnidad = estratoUnidad;
    }

    public String getClaveEstratoUnidad() {
        return claveEstratoUnidad;
    }

    public void setClaveEstratoUnidad(String claveEstratoUnidad) {
        this.claveEstratoUnidad = claveEstratoUnidad;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getClaveTipoObra() {
        return claveTipoObra;
    }

    public void setClaveTipoObra(String claveTipoObra) {
        this.claveTipoObra = claveTipoObra;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getAreasServicios() {
        return areasServicios;
    }

    public void setAreasServicios(String areasServicios) {
        this.areasServicios = areasServicios;
    }

    public String getUltimoMovimiento() {
        return ultimoMovimiento;
    }

    public void setUltimoMovimiento(String ultimoMovimiento) {
        this.ultimoMovimiento = ultimoMovimiento;
    }

    public String getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(String fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public String getFechaEfectivaBaja() {
        return fechaEfectivaBaja;
    }

    public void setFechaEfectivaBaja(String fechaEfectivaBaja) {
        this.fechaEfectivaBaja = fechaEfectivaBaja;
    }

    public String getCertificacionCsg() {
        return certificacionCsg;
    }

    public void setCertificacionCsg(String certificacionCsg) {
        this.certificacionCsg = certificacionCsg;
    }

    public String getTipoCertificacion() {
        return tipoCertificacion;
    }

    public void setTipoCertificacion(String tipoCertificacion) {
        this.tipoCertificacion = tipoCertificacion;
    }

    public String getVigenciaCertificacion() {
        return vigenciaCertificacion;
    }

    public void setVigenciaCertificacion(String vigenciaCertificacion) {
        this.vigenciaCertificacion = vigenciaCertificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstatusUnidad() {
        return estatusUnidad;
    }

    public void setEstatusUnidad(Integer estatusUnidad) {
        this.estatusUnidad = estatusUnidad;
    }
    
    
}
