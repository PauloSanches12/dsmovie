import { ReactComponent as GithubIcon } from "assets/img/github.svg"
import { Link } from "react-router-dom";
import './styles.css';

const Navbar: React.FC = () => {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <Link to="/">
                        <h1>DSMovie</h1>
                    </Link>
                    <a href="https://github.com/PauloSanches12" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/Paulo Sérgio</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;